package com.three.memory.domain;

public class AcePackLogs {
    private Integer id;

    private Integer usrid;

    private Integer aceid;

    private String logstime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUsrid() {
        return usrid;
    }

    public void setUsrid(Integer usrid) {
        this.usrid = usrid;
    }

    public Integer getAceid() {
        return aceid;
    }

    public void setAceid(Integer aceid) {
        this.aceid = aceid;
    }

    public String getLogstime() {
        return logstime;
    }

    public void setLogstime(String logstime) {
        this.logstime = logstime == null ? null : logstime.trim();
    }

    public AcePackLogs() {
    }

    public AcePackLogs(Integer usrid, Integer aceid, String logstime) {
        this.usrid = usrid;
        this.aceid = aceid;
        this.logstime = logstime;
    }
}