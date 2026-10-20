public class Main {
    public static void main(String[] args) {

        absFabrica fabrica1 = new FabricaBrasil();

        Matricula matriculaBrasil = new Matricula(fabrica1);


        absFabrica fabrica2 = new FabricaChile();

        Matricula matriculaChile = new Matricula(fabrica2);

        System.out.println(matriculaBrasil.realizarMatricula());
        System.out.println(matriculaChile.realizarMatricula());


    }
}
    