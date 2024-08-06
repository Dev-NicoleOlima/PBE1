package prjCaneta;

public class Livro {
	 String nomeLivro;
	    String nomeAutor;
	    boolean alugado;
	    
	    public Livro (String nomeLivro, String autor) {
	    	this.nomeLivro = nomeLivro;
	    	this.nomeAutor = autor;
	    			this.alugado = false;
	    }

	    
	    void status() {
	    	System.out.println( "1. "+this.nomeLivro +":"+( this.alugado ? "alugado":"disponível"));
	    	
	         }
	    
	   
	    void alugar () {
	    	alugado = true;
	    	  this.alugado = true;
	}
	    void devolver() {
	    alugado = false;
	    	this.alugado = false;
	    	}
	    }


