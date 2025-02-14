public class Livro {
private String Titulo;
private String Autor;
private int numeroDePaginas;
private Double Preco;


public Livro(String titulo, String autor, int numeroDePaginas, Double preco) {
    this.Titulo = titulo;
    this.Autor = autor;
    this.numeroDePaginas = numeroDePaginas;
    this.Preco = preco;


    
}


public String getTitulo() {
    return Titulo;
}


public void setTitulo(String titulo) {
    this.Titulo = titulo;
}


public String getAutor() {
    return Autor;
}


public void setAutor(String autor) {
    this.Autor = autor;
}


public int getNumeroDePaginas() {
    return numeroDePaginas;
}


public void setNumeroDePaginas(int numeroDePaginas) {
    this.numeroDePaginas = numeroDePaginas;
}


public Double getPreco() {
    return Preco;
}


public void setPreco(Double preco) {
    this.Preco = preco;
}





}
