package VO;

import VO.Turma;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-08T03:31:29")
@StaticMetamodel(Disciplina.class)
public class Disciplina_ { 

    public static volatile SingularAttribute<Disciplina, Integer> carga_horaria;
    public static volatile SingularAttribute<Disciplina, Integer> periodo;
    public static volatile ListAttribute<Disciplina, Turma> turmas;
    public static volatile SingularAttribute<Disciplina, String> ementa;
    public static volatile SingularAttribute<Disciplina, String> nome;
    public static volatile SingularAttribute<Disciplina, Long> id_disciplina;
    public static volatile SingularAttribute<Disciplina, Boolean> status;

}