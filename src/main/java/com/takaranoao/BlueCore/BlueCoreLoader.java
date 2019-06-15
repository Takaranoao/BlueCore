package com.takaranoao.BlueCore;
/*
版权所有 (C) 2019 Takaranoao
本插件部分代码来自以MIT许可协议开源的 NyaaCore (https://github.com/NyaaCat/NyaaCore) 由 NyaaCat Community 开发
 */
import org.bukkit.plugin.java.JavaPlugin;

public class BlueCoreLoader extends JavaPlugin {
    private static BlueCoreLoader instance;
    public static BlueCoreLoader getInstance() {
        return instance;
    }
    public void onLoad() {
        instance = this;
    }
}
