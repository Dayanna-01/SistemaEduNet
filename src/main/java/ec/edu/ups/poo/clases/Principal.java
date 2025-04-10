package ec.edu.ups.poo.clases;
import ec.edu.ups.POO.clases.Administrativo;
import ec.edu.ups.poo.enums.Rol;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {

        // Crear instituciones
        Institucion institucion1 = new Institucion(1, "Universidad Politecnica Salesiana");
        institucion1.getSedes().add("Campus Sede Cuenca");
        institucion1.addDireccion("C. Vieja", "Av. Elia Luit", "001", "Ecuador", "Azuay", "Cuenca", "INSTITUCION");

        Institucion institucion2 = new Institucion(2, "Universidad San Francisco");
        institucion2.getSedes().add("Campus Cumbayá");
        institucion2.addDireccion("Diego de Robles", "Interoceánica", "210", "Ecuador", "Pichincha", "Quito", "INSTITUCION");

        // Crear personas
        Estudiante estudiante = new Estudiante("0107267452", "Dayanna", "Chacha", "0987867318", "dayannachv@gmail.com", "Computación");
        Docente docente = new Docente("0203040506", "Ana", "Martínez", "0998765432", "ana@mail.com");
        docente.getTitulosAcademicos().add("Magíster en Matemáticas");
        docente.getAreasDeEspecializacion().add("Cálculo Integral");

        ec.edu.ups.POO.clases.Administrativo administrativo = new Administrativo("0304050607", "Carlos", "López", "0976543210", "carlos@mail.com");
        administrativo.getCargos().add("Coordinador de Recursos");
        administrativo.getResponsabilidades().add("Gestión Administrativa");

        Visitante visitante = new Visitante("0103382214", "Santiago", "Chacha", "0987710240", "schacha6@msn.com", "Charla sobre pago matricula",
                new GregorianCalendar(2024, 4, 10), new GregorianCalendar(2024, 4, 12));

        // Asignaciones
        GregorianCalendar fechaEstudiante = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacionEstudiante = new Asignacion(estudiante, fechaEstudiante, Rol.ESTUDIANTE);
        institucion1.getAsignaciones().add(asignacionEstudiante);

        GregorianCalendar fechaDocente = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacionDocente = new Asignacion(docente, fechaDocente, Rol.DOCENTE);
        institucion1.getAsignaciones().add(asignacionDocente);

        GregorianCalendar fechaAdministrativo = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacionAdministrativo = new Asignacion(administrativo, fechaAdministrativo, Rol.ADMINISTRATIVO);
        institucion2.getAsignaciones().add(asignacionAdministrativo);

        GregorianCalendar fechaVisitante = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacionVisitante = new Asignacion(visitante, fechaVisitante, Rol.VISITANTE);
        institucion2.getAsignaciones().add(asignacionVisitante);

        // Formato de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Salida organizada
        System.out.println("=============================================");
        System.out.println("               INSTITUCIÓN 1");
        System.out.println("=============================================");
        System.out.println("Nombre: " + institucion1.getNombreInstitucion());
        System.out.println("Sedes: " + institucion1.getSedes());
        System.out.println("Dirección: " + institucion1.getDireccion());

        System.out.println("\n--------- Estudiante ---------");
        System.out.println(estudiante);

        System.out.println("\n--------- Docente ---------");
        System.out.println(docente);

        System.out.println("\n--------- Asignaciones ---------");
        System.out.println("Estudiante: " + asignacionEstudiante.getRol() + ", Fecha de inicio: " + sdf.format(asignacionEstudiante.getFechaInicio().getTime()));
        System.out.println("Docente: " + asignacionDocente.getRol() + ", Fecha de inicio: " + sdf.format(asignacionDocente.getFechaInicio().getTime()));

        System.out.println("\n=============================================");
        System.out.println("               INSTITUCIÓN 2");
        System.out.println("=============================================");
        System.out.println("Nombre: " + institucion2.getNombreInstitucion());
        System.out.println("Sedes: " + institucion2.getSedes());
        System.out.println("Dirección: " + institucion2.getDireccion());

        System.out.println("\n--------- Administrativo ---------");
        System.out.println(administrativo);

        System.out.println("\n--------- Visitante ---------");
        System.out.println(visitante);

        System.out.println("\n--------- Asignaciones ---------");
        System.out.println("Administrativo: " + asignacionAdministrativo.getRol() + ", Fecha de inicio: " + sdf.format(asignacionAdministrativo.getFechaInicio().getTime()));
        System.out.println("Visitante: " + asignacionVisitante.getRol() + ", Fecha de entrada: " + sdf.format(asignacionVisitante.getFechaInicio().getTime()));
        System.out.println("=============================================");
    }
}

