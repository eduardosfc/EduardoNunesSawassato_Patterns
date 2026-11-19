// Classe "legada": simula uma biblioteca antiga que não pode ser alterada
public class LegacyLogger {
    public void log(String level, String text) {
        System.out.println("[" + level + "] " + text);
    }
}
