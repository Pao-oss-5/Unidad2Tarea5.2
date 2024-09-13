
    public class Empleado {
        // Calcular el salario solo con el sueldo base
        public double calcularSalario(double sueldoBase) {
            return sueldoBase;
        }

        // Calcular el salario con sueldo base y bonificación
        public double calcularSalario(double sueldoBase, double bonificacion) {
            return sueldoBase + bonificacion;
        }

        //Calcular el salario con sueldo base, bonificación y horas extras
        public double calcularSalario(double sueldoBase, double bonificacion, int horasExtras) {
            return sueldoBase + bonificacion + (horasExtras * 20);
        }

    }
