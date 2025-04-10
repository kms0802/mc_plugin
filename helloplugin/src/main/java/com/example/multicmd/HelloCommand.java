package com.example.multicmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelloCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[]args) {
        sender.sendMessage("안녕하세요! 즐거운 시간 되세요!");
        return true;
    }
}
