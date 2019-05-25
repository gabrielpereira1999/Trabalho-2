package beans;

public class Processador extends Produtos{
	String clock;
	int thread, nucleo;
	public String getClock() {
		return clock;
	}
	public void setClock(String clock) {
		this.clock = clock;
	}
	public int getThread() {
		return thread;
	}
	public void setThread(int thread) {
		this.thread = thread;
	}
	public int getNucleo() {
		return nucleo;
	}
	public void setNucleo(int nucleo) {
		this.nucleo = nucleo;
	}

}
