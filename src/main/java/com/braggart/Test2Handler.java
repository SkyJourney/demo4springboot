package com.braggart;


import top.icdat.juicer.annotation.Handler;
import top.icdat.juicer.annotation.Href;
import top.icdat.juicer.annotation.Parser;
import top.icdat.juicer.core.JuicerData;
import top.icdat.juicer.core.JuicerSource;
import org.jsoup.Connection;


@Handler(value = "test2", parent = "test")
public class Test2Handler {

    @Href
    public JuicerSource a(JuicerData juicerData) {
        return JuicerSource.getInstance().addUrl("http://www.4399.com");
    }

    @Parser
    public JuicerData b(Connection.Response response) throws Exception {
//        Thread.sleep(5000);
        return JuicerData.getInstance().addData("record2", "record2");
    }

}
