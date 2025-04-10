package com.example.dayplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DayPlugin implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args) {
        sender.sendMessage("오늘도 좋은 하루 보내세요 ");
        return true;
    }
}
