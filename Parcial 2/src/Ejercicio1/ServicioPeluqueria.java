package Ejercicio1;


    public enum ServicioPeluqueria {

        CORTE("Cortar cabello", "Servicio pa cortar su cabello", 50.000) {
            public void mostrarDescripcionServicio() {
                System.out.println("Servicio para cortar su cabello");
            }
        },

        UNAS("Cortar uñas", "Servicio para cortar sus uñas", 35.000){
            public void mostrarDescripcionServicio() {
                System.out.println("Servicio para cortar sus uñas");
            }
        },

        TINTE("Tinturar cabello", "Servicio para tinturar su cabello", 100.000) {
            public void mostrarDescripcionServicio() {
                System.out.println("Servicio para tinturar su cabello");
            }
        };
        private String nombre;
        private String descripcion;
        private double precio;

        ServicioPeluqueria(String nombre, String descripcion, double precio) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.precio = precio;
        }
        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public double getPrecio() {
            return precio;
        }

    }
