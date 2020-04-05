public class FuncionesUsuario {

    public int calculoDeImp(Usuario unUsuario) {
        int ret = 0;
        if ((unUsuario.getEdad() > 17 && unUsuario.getEdad() < 31) || unUsuario.getEdad() > 65) {
            if (unUsuario.getCantHijos() * 3 > 50) {
                ret = 1000;
            } else {
                int descuento = unUsuario.getCantHijos() * 0.03;
                ret = 2000 - (2000*descuento);
            }
        } else {
            if (unUsuario.getEdad() > 29 && unUsuario.getEdad() < 66) {
                if (unUsuario.getCantHijos() * 3 > 50) {
                    ret = 3500;
                } else {
                    int descuento = unUsuario.getCantHijos() * 0.03;
                    ret = 7000 - (7000*descuento);
                }
            }
        }
        return ret;
    }
