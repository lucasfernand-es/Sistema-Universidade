package VO;

import VO.Matricula;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-08T03:31:29")
@StaticMetamodel(Aluno.class)
public class Aluno_ { 

    public static volatile SingularAttribute<Aluno, String> nome_curso;
    public static volatile SingularAttribute<Aluno, String> situacao;
    public static volatile SingularAttribute<Aluno, String> telefone;
    public static volatile SingularAttribute<Aluno, Integer> periodo;
    public static volatile SingularAttribute<Aluno, Long> id_aluno;
    public static volatile SingularAttribute<Aluno, Date> ingresso;
    public static volatile SingularAttribute<Aluno, String> nome;
    public static volatile SingularAttribute<Aluno, Float> coeficiente;
    public static volatile SingularAttribute<Aluno, String> turno;
    public static volatile ListAttribute<Aluno, Matricula> matriculas;
    public static volatile SingularAttribute<Aluno, Integer> ra;

}