package br.com.digitalhouse.objetosjava;

public class Principal {

    public static void main(String[] args) {

        Animal animalMamifero;
        animalMamifero = new Animal("Bidu");//construtor específico
        Animal animalDomestico;
        animalDomestico = new Animal(); //Construtor padrão

        System.out.println(animalMamifero.nomeAnimal);
        System.out.println(animalMamifero.raca);
        System.out.println(animalMamifero.cor);
        System.out.println(animalMamifero.idade);

        System.out.println(animalDomestico.nomeAnimal);//construtor padrão

        // Animal animalMamifero;
        animalMamifero = new Animal("Bidu");//construtor específico

        Animal animalDomestico;
        animalDomestico = new Animal(); //Construtor padrão

        animalMamifero.setNomeAnimalPrivado("Lulu");  // imprimirá Lulu

        System.out.println(animalMamifero.getNomeAnimalPrivado());
        System.out.println(animalMamifero.getRacaPrivado());
        System.out.println(animalMamifero.getIdadePrivado());
        System.out.println(animalMamifero.getCorPrivado());

        animalDomestico.setNomeAnimalPrivado("Ted");

        System.out.println(animalDomestico.getNomeAnimalPrivado());//construtor padrão

    }
}

/*Resultado no console
"C:\Program Files\Java\jdk1.8.0_221\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1\lib\idea_rt.jar=50995:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2019.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_221\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\rt.jar;C:\Users\Cliente\IdeaProjects\aula6_Java_com_Objetos\out\production\aula6_Java_com_Objetos" br.com.digitalhouse.objetosjava.Principal
        Bidu  //construtor específico
        null  //construtor específico sem parametros
        null  //construtor específico sem parametros
        0     //construtor específico sem parametros
        null  //construtor padrão

        Process finished with exit code 0*/
