public class Livro {
private String Titulo;
private String Autor;
private int Isbn;
private int numeroPagina;
private Double valorCompra;


public Livro(String titulo, String autor, int isbn, int numeroPagina, Double valorCompra) {
    Titulo = titulo;
    Autor = autor;
    Isbn = isbn;
    this.numeroPagina = numeroPagina;
    this.valorCompra = valorCompra;


}

public String getTitulo() {
    return Titulo;
}


public void setTitulo(String titulo) {
    Titulo = titulo;
}


public String getAutor() {
    return Autor;
}


public void setAutor(String autor) {
    Autor = autor;
}


public int getIsbn() {
    return Isbn;
}


public void setIsbn(int isbn) {
    Isbn = isbn;
}


public int getNumeroPagina() {
    return numeroPagina;
}


public void setNumeroPagina(int numeroPagina) {
    this.numeroPagina = numeroPagina;
}


public Double getValorCompra() {
    return valorCompra;
}


public void setValorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;

}


}
