package projetoyoutube;
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacoes;
    private int views;
    private int curtidas;
    private boolean reporduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = 0;
        this.curtidas = 0;
        this.views = 0;
        this.reporduzindo = false;
    }
   
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        int nova;
        nova = (int) ((this.avaliacoes + avaliacoes)/this.views);
        this.avaliacoes = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReporduzindo() {
        return reporduzindo;
    }

    public void setReporduzindo(boolean reporduzindo) {
        this.reporduzindo = reporduzindo;
    }
    
    
    @Override
    public void play() {
        this.reporduzindo = true;

    }

    @Override
    public void pause() {
        this.reporduzindo = false;

    }

    @Override
    public void like() {
        this.curtidas ++;

    }

    @Override
    public String toString() {
        return "Video{" + "titulo = " + titulo + ", avaliacoes = " + avaliacoes + ", views = " + views + ", curtidas = " + curtidas + ", reporduzindo = " + reporduzindo + '}';
    } 
    
}
