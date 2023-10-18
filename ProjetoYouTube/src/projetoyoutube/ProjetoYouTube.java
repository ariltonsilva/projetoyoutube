package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {

            Video v[] = new Video [3];
            v [0] = new Video("Aprendendo Java");
            v [1] = new Video("HTML5");
            v [2] = new Video("Python");
            
            Gafanhoto g[] = new Gafanhoto[2];
            g[0] = new Gafanhoto("Ari", 22, "M", "Jhoow");
            g[1] = new Gafanhoto("Talita", 25, "F", "THA");
            
            Visualizacao vi [] = new Visualizacao [5];
            vi[0] = new Visualizacao (g[0], v[2]);
            vi[0].avaliar();
            System.out.println(vi[0].toString());
            
            vi[1] = new Visualizacao (g[0], v[1]);
            vi[1].avaliar(35.0f);
            System.out.println(vi[1].toString());
            
    }
    
}
