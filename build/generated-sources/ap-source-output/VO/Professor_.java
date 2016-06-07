package VO;

import VO.Turma;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-07T03:12:05")
@StaticMetamodel(Professor.class)
public class Professor_ { 

    public static volatile SingularAttribute<Professor, String> rg;
    public static volatile ListAttribute<Professor, Turma> turmas;
    public static volatile SingularAttribute<Professor, String> cpf;
    public static volatile SingularAttribute<Professor, Long> id_professor;
    public static volatile SingularAttribute<Professor, String> nome;
    public static volatile SingularAttribute<Professor, Date> dataNascimento;
    public static volatile SingularAttribute<Professor, String> email;
    public static volatile SingularAttribute<Professor, Boolean> status;

}