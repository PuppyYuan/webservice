package com.puppyyuan.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * 存储整个工程的全局配置
 *
 * Created by yuanpeng on 2018/1/30.
 */
public class NettyConfig {

    /**
     *  存储每一个客户端接入进来的channel对象
     * */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
