package entidades;

public final class EdificioDeOficina extends Edificio {

    private Integer cantidadOficina, cantidadPersonaOficina, numeroPisos;

    public EdificioDeOficina(Double ancho, Double largo, Double alto, Integer cantidadOficina, Integer cantidadPersonaOficina, Integer numeroPisos) {
        super(ancho, largo, alto);
        this.cantidadOficina = cantidadOficina;
        this.cantidadPersonaOficina = cantidadPersonaOficina;
        this.numeroPisos = numeroPisos;
    }

    /*
    public EdficioDeOficina crearEdificiOf() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("--------------------------------------------");
        System.out.println("Ingrese el ancho del edificio");
        double ancho = input.nextDouble();
        System.out.println("Ingrese el largo del edificio");
        double largo = input.nextDouble();
        System.out.println("Ingrese el alto del edificio");
        double alto = input.nextDouble();
        System.out.println("Ingrese el numero de pisos del edificio");
        int pisos = input.nextInt();
        System.out.println("Ingrese la cantidad de oficinas por piso");
        int oficinas = input.nextInt();
        System.out.println("Ingrese la cantidad de personas maxima por oficina");
        int personas = input.nextInt();
        return new EdficioDeOficina(ancho, largo, alto, oficinas, personas, pisos);
    }

     */

    @Override
    public double calcularSuperficie() {
        double superficie = this.largo * this.ancho;
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = this.largo * this.ancho * this.alto;
        return volumen;
    }

    public int personasMaxEdificio() {
        int maxEnEdificio = this.cantidadOficina * this.cantidadPersonaOficina * this.numeroPisos;
        return maxEnEdificio;
    }

    public int personasPorPiso() {
        int porPiso = this.cantidadOficina * this.cantidadPersonaOficina;
        return porPiso;
    }


}
