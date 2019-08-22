package com.yunku.demo.tool;

import com.yunku.demo.common.constant.ResponseStatusEnum;
import com.yunku.demo.common.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Copyright © 2018广州创致信息科技有限公司 All rights reserved.
 *
 * @Description: TODO
 * @author: ChenZongle
 * @date: 2018年9月3日 上午11:23:39
 */
public class FileUpload {

    public static final String FILE_DATE_FORMAT = "yyyyMMddHHmmssSS";

    public static final String DEFULT_FILE_UPLOAD_PATH = "upload";

    private static final Logger logger = LoggerFactory.getLogger(FileUpload.class);
    /*
     * 单文件上传
     */
    public static String fileUpload(MultipartFile file, HttpServletRequest request) {
        SimpleDateFormat sdf = new SimpleDateFormat(FILE_DATE_FORMAT);
        String res = sdf.format(new Date());
        String rootPath = request.getSession().getServletContext().getRealPath(DEFULT_FILE_UPLOAD_PATH);
        // 原始名称
        String originalFileName = file.getOriginalFilename();
        String newFileName = "sliver" + res + originalFileName.substring(originalFileName.lastIndexOf("."));
//		System.err.println("~~~~~~~~~~~~~~~~~~~new File Name is :__________ "+newFileName+"__________");
        // 创建年月文件夹
        Calendar date = Calendar.getInstance();
        File dateDirs = new File(date.get(Calendar.YEAR) + File.separator + (date.get(Calendar.MONTH) + 1));
        // 新文件
        File newFile = new File(rootPath + File.separator + dateDirs + File.separator + newFileName);
        // 判断目标文件所在目录是否存在
        if (!newFile.getParentFile().exists()) {
            // 如果目标文件所在的目录不存在，则创建父目录
            newFile.getParentFile().mkdirs();
        }

        // 将内存中的数据写入磁盘
        try {
            file.transferTo(newFile);
        } catch (IllegalStateException e) {
            e.printStackTrace();
            throw e;
//            return "文件上传失败,失败原因" + e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            throw new ServiceException(ResponseStatusEnum.IO_ERROR);
//            return "文件上传失败,失败原因" + e.getMessage();
        }
        // 完整的url
        String fileUrl = "http://gzdxjy.globalviewcco.com/upload/" + date.get(Calendar.YEAR) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + newFileName;
        return fileUrl;
    }

    public static String[] fileUpload(MultipartFile[] files, HttpServletRequest request) {
        String[] strings = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            strings[i] = fileUpload(files[i], request);
        }
        return strings;
    }

    /**
     * * @Description: 删除文件
     *
     * @param filePath 保存文件的path全路径
     * @return
     */
    public static Boolean delete(String filePath) {
        // 项目下相对路径
        File file = new File(filePath);
        if (file.isFile() && file.exists()) {
            Boolean succeedDelete = file.delete();
            if (succeedDelete) {
                logger.info("删除单个文件" + filePath + "成功！");
                return true;
            } else {
                logger.info("删除单个文件" + filePath + "件失败！");
                return true;
            }
        } else {
            logger.info("删除单个文件" + filePath + "失败！");
            return false;
        }
    }

    /**
     * * @Description: 删除特定的文件
     *
     * @param path            某一路径下
     * @param containFileName 包含的文件名
     * @return 返回操作状态
     */
    public static Boolean deletePDF(String path, String containFileName) {
        // 获得物理路径webapp所在路径
        // 项目下相对路径
        File file = new File(path);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        for (File item : listFiles) {
            String name = item.getName();
            if (item.isFile() && item.exists() && name.contains(containFileName)) {
                item.delete();
            }
        }
        return true;
    }

    /**
     * @param file JSON文件
     * @return JSON内容字符串
     * @Description: 读取JSON文件的内容为字符串
     * @author zhongjunhao
     * @date: 2018年8月15日 下午17:23:00
     */
    public static String jsonRead(File file) {
        Scanner scanner = null;
        StringBuilder buffer = new StringBuilder();
        try {
            scanner = new Scanner(file, "utf-8");
            while (scanner.hasNextLine()) {
                buffer.append(scanner.nextLine());
            }
        } catch (Exception e) {

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return buffer.toString();
    }

    /**
     * 删除服务器中的
     *
     * @param paths 图片路径
     */
    public static boolean deleteServerPicture(List<String> paths, HttpServletRequest request) {
        boolean flag = true;
        System.out.println("-------------开始删除图片-------------");
        String fs = System.getProperty("file.separator");
        String rootPath = request.getSession().getServletContext().getRealPath("");
        for (int i = 0; i < paths.size(); i++) {
            String path = paths.get(i);
            path = paths.get(i).substring(path.indexOf(DEFULT_FILE_UPLOAD_PATH));
            String TEMP_PATH = rootPath + fs + path + fs;
            System.out.println("--------------删除图片路径为" + TEMP_PATH);
            File fileTemp = new File(TEMP_PATH);
            if (fileTemp.exists()) {
                flag = fileTemp.delete();
            } else {
                flag = false;
            }
        }
        System.out.println("-----------结束删除图片------------图片删除状态为：" + flag);
        return flag;
    }
}
