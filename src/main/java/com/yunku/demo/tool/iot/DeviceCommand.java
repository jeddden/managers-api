package com.yunku.demo.tool.iot;

/**
 * 设备指令
 *
 * @author Jeddden
 * @create 2019-08-26 22:08
 */
public enum DeviceCommand {
    READ_PORT_CHARGING_STATUS("cloud-162",null),
    READ_PORT_CHARGING_STATUS_INFO("cloud-168",null),
    OPEN_CHARGER_BOX_DOOR("cloud-161",0),
    OPEN_RECHARGER_BOX_DOOR("cloud-161",3),
    PUT_RECHARGER_BOX_BATTERY("cloud-161",8),
    START_CHARGE("cloud-161",1),
    STOP_CHARGE("cloud-161",5),
    READ_PORT_INFORMTION("cloud-163",-1)
    ;


    private String actionId;
    private Integer command;

    DeviceCommand(String actionId, Integer command) {
        this.actionId = actionId;
        this.command = command;
    }

    public String getActionId() {
        return actionId;
    }

    public Integer getCommand() {
        return command;
    }
}
