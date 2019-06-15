package com.takaranoao.BlueCore;
/*
CopyRight (C) 2019 Takaranoao
Part of the code for this plugin comes from NyaaCore (https://github.com/NyaaCat/NyaaCore). Developed by NyaaCat Community.
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
