package stub;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    // @Mock
    // GradeSystem gradeSystem = new GradeSystem();
    GradeSystem gradeSystem = Mockito.mock(GradeSystem.class);
    GradeService gradeService = new GradeService(gradeSystem);

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        when(gradeSystem.gradesFor(0)).thenReturn(new ArrayList<Double>(Arrays.asList(80.0, 90.0, 100.0)));
        assertEquals(90.0, gradeService.calculateAverageGrades(0));
    }
}
