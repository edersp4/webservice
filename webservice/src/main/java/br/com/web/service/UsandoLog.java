package br.com.web.service;
import org.apache.log4j.Logger;

public class UsandoLog {

	static final Logger debugLog = Logger.getLogger(UsandoLog.class);
	// Usando dois logs
	// debugLog.info("Teste do arquivo de log para debug");
	// resultLog.info("Testet para ir para o outro arquivo");

	public static void main(String[] args) {
		debugLog.info("Teste do arquivo de log  para debug");
		// debugLog.info("Teste do arquivo de log para debug");
		// resultLog.info("Testet para ir para o outro arquivo");
		try {
			if (true) {
				throw new Exception("Teste");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
