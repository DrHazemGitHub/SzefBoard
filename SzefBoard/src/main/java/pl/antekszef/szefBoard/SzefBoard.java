package pl.antekszef.szefBoard;

import org.bukkit.plugin.java.JavaPlugin;

public class SzefBoard extends JavaPlugin {

    private static SzefBoard instance;

    @Override
    public void onEnable() {
        instance = this;

        // Wczytaj config
        saveDefaultConfig();

        // Rejestracja scoreboarda
        new BoardManager(this);
    }

    public static SzefBoard getInstance() {
        return instance;
    }
}
