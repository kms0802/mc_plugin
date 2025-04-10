package com.example.helloplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import com.example.dayplugin.DayPlugin;
import com.example.multicmd.ByeCommand;
import com.example.multicmd.HelloCommand;

public class HelloPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("HelloPlugin 플러그인이 활성화되었습니다!");
        getCommand("hello").setExecutor(new HelloCommand());
        getCommand("bye").setExecutor(new ByeCommand());
        getCommand("day").setExecutor(new DayPlugin());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (label.toLowerCase()) {
            case "hello":
                sender.sendMessage("안녕! 내가 안만든 플러그인이야 😎");
                return true;
            case "ping":
                sender.sendMessage("퐁!");
                return true;
            case "goodbye":
                sender.sendMessage("잘 가~ 다음에 또 봐!");
                return true;
            default:
                return false;
        }
    }

}
