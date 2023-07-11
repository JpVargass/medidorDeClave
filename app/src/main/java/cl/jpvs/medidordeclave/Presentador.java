package cl.jpvs.medidordeclave;

public class Presentador {

    private Modelo modelo;

    private VistaPresentador vistaPresentador;

    public Presentador(VistaPresentador vistaPresentador) {
        this.vistaPresentador = vistaPresentador;

        modelo = new Modelo();
    }


    public void  evaluarContrasena(String password) {

        int nivelFuerza = modelo.validarClave(password);

        switch (nivelFuerza){
            case Modelo.DEBIL:
                this.vistaPresentador.mostrarDebil();
                break;
            case Modelo.MEDIA:
                this.vistaPresentador.mostrarMedia();
                break;
            case Modelo.FUERTE:
                this.vistaPresentador.mostrarFuerte();
                break;
            default:
                this.vistaPresentador.mostrarError();
                break;

        }

        }

    }

