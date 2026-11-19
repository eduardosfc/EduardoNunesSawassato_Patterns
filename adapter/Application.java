public class Application {

    // depende só da interface Logger, não sabe nada do legado
    private final Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void run() {
        logger.info("Iniciando aplicação");
        logger.error("Falha ao conectar no banco");
    }
}
