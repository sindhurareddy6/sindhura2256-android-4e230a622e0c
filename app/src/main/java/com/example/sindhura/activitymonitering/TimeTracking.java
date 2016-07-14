package com.example.sindhura.activitymonitering;

import android.widget.TextView;

import com.orm.SugarRecord;

/**
 * Created by Acer on 10-07-2016.
 */
public class TimeTracking extends SugarRecord {
    public String task;
    public String cat;
    public Long startTime;
    public Long endTime;
    public String status;
    public Long totalTime;
    public
    TimeTracking()
    {

    }
    public TimeTracking(String task,String cat,Long startTime,Long endTime,String status,Long totalTime)
    {
        this.task=task;
        this.cat=cat;
        this.startTime= startTime;
        this.endTime=endTime;
        this.status=status;
        this.totalTime=totalTime;
    }
    public String toString(){
        return task+"   "+cat+"  "+startTime+"  "+status;

    }


}
