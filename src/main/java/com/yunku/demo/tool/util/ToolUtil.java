package com.yunku.demo.tool.util;


import com.yunku.demo.common.constant.ResponseStatusEnum;
import com.yunku.demo.common.exception.ServiceException;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.*;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Jeddden
 * @create 2019-06-16 9:36
 */
public class ToolUtil {

    public static final int SALT_LENGTH = 6;

    public ToolUtil() {
    }

    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < length; ++i) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }

        return sb.toString();
    }

    public static String md5Hex(String password, String salt) {
        return md5Hex(password + salt);
    }

    public static String md5Hex(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bs = md5.digest(str.getBytes());
            StringBuffer md5StrBuff = new StringBuffer();

            for(int i = 0; i < bs.length; ++i) {
                if (Integer.toHexString(255 & bs[i]).length() == 1) {
                    md5StrBuff.append("0").append(Integer.toHexString(255 & bs[i]));
                } else {
                    md5StrBuff.append(Integer.toHexString(255 & bs[i]));
                }
            }

            return md5StrBuff.toString();
        } catch (Exception var5) {
            throw new ServiceException(ResponseStatusEnum.ENCRYPT_ERROR);
        }
    }

    public static String removeWhiteSpace(String value) {
        return isEmpty(value) ? "" : value.replaceAll("\\s*", "");
    }

    public static String getCreateTimeBefore(int seconds) {
        long currentTimeInMillis = Calendar.getInstance().getTimeInMillis();
        Date date = new Date(currentTimeInMillis - (long)(seconds * 1000));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static String getExceptionMsg(Throwable e) {
        StringWriter sw = new StringWriter();

        try {
            e.printStackTrace(new PrintWriter(sw));
        } finally {
            try {
                sw.close();
            } catch (IOException var8) {
                var8.printStackTrace();
            }

        }

        return sw.getBuffer().toString().replaceAll("\\$", "T");
    }

//    public static String getApplicationName() {
//        try {
//            AppNameProperties appNameProperties = (AppNameProperties)SpringContextHolder.getBean(AppNameProperties.class);
//            return appNameProperties != null ? appNameProperties.getName() : "";
//        } catch (Exception var2) {
//            Logger logger = LoggerFactory.getLogger(ToolUtil.class);
//            logger.error("获取应用名称错误！", var2);
//            return "";
//        }
//    }

    public static String getIP() {
        try {
            StringBuilder IFCONFIG = new StringBuilder();
            Enumeration en = NetworkInterface.getNetworkInterfaces();

            while(en.hasMoreElements()) {
                NetworkInterface intf = (NetworkInterface)en.nextElement();
                Enumeration enumIpAddr = intf.getInetAddresses();

                while(enumIpAddr.hasMoreElements()) {
                    InetAddress inetAddress = (InetAddress)enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress() && inetAddress.isSiteLocalAddress()) {
                        IFCONFIG.append(inetAddress.getHostAddress().toString() + "\n");
                    }
                }
            }

            return IFCONFIG.toString();
        } catch (SocketException var6) {
            var6.printStackTrace();

            try {
                return InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException var5) {
                var5.printStackTrace();
                return null;
            }
        }
    }

//    public static void copyProperties(Object source, Object target) {
//        BeanUtil.copyProperties(source, target, CopyOptions.create().setIgnoreNullValue(true));
//    }

    public static Boolean isWinOs() {
        String os = System.getProperty("os.name");
        return os.toLowerCase().startsWith("win") ? true : false;
    }

    public static String getTempPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static Integer toInt(Object val) {
        if (val instanceof Double) {
            BigDecimal bigDecimal = new BigDecimal((Double)val);
            return bigDecimal.intValue();
        } else {
            return Integer.valueOf(val.toString());
        }
    }

    public static boolean isNum(Object obj) {
        try {
            Integer.parseInt(obj.toString());
            return true;
        } catch (Exception var2) {
            return false;
        }
    }

    public static String getWebRootPath(String filePath) {
        try {
            String path = ToolUtil.class.getClassLoader().getResource("").toURI().getPath();
            path = path.replace("/WEB-INF/classes/", "");
            path = path.replace("/target/classes/", "");
            path = path.replace("file:/", "");
            return isEmpty(filePath) ? path : path + "/" + filePath;
        } catch (URISyntaxException var2) {
            throw new RuntimeException(var2);
        }
    }

    public static String getFileSuffix(String fileWholeName) {
        if (isEmpty(fileWholeName)) {
            return "none";
        } else {
            int lastIndexOf = fileWholeName.lastIndexOf(".");
            return fileWholeName.substring(lastIndexOf + 1);
        }
    }

//    public static String dateType(Object o) {
//        return o instanceof Date ? DateUtil.formatDate((Date)o) : o.toString();
//    }
//
//    public static String currentTime() {
//        return DateUtil.formatDateTime(new Date());
//    }

    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }

    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        } else {
            if (o instanceof String) {
                if (o.toString().trim().equals("")) {
                    return true;
                }
            } else if (o instanceof List) {
                if (((List)o).size() == 0) {
                    return true;
                }
            } else if (o instanceof Map) {
                if (((Map)o).size() == 0) {
                    return true;
                }
            } else if (o instanceof Set) {
                if (((Set)o).size() == 0) {
                    return true;
                }
            } else if (o instanceof Object[]) {
                if (((Object[])((Object[])o)).length == 0) {
                    return true;
                }
            } else if (o instanceof int[]) {
                if (((int[])((int[])o)).length == 0) {
                    return true;
                }
            } else if (o instanceof long[] && ((long[])((long[])o)).length == 0) {
                return true;
            }

            return false;
        }
    }

}
