package JavaClasses;

public class Livro {

  private String title;
  private int pages;
  private String isbn;
  
  public Livro(String title, int pages) {
    this.setTitle(title);
    this.setPages(pages);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    if (pages == 0) {
      System.out.println("O total de páginas não pode ser 0.");      
    }
    this.pages = pages;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

}
