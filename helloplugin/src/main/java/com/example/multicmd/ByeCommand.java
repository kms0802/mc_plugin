package com.example.multicmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ByeCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[]args) {
        sender.sendMessage("안녕히 가세요! 다음에 또 봐요!");
        return true;
    }
}
