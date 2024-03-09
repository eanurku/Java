package com.anurag;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.*;
import org.mockito.Mockito;

public class EmployeeControllerTest {


    @Before
    public void setup(){
        System.out.println("Running with @Before");
    }


    @BeforeClass
    public static void setupOnce(){
        System.out.println("Running @BeforeClass");
    }

    @After
    public void destroy(){
        System.out.println("running @After");
    }

    @AfterClass
    public static void destroyOnce(){
        System.out.println("@AfterClass");
    }

    @Test
    public void testEmployee(){
        System.out.println("running testEmployee");

        Employee emp = Mockito.mock(Employee.class);
        EmployeeService service = Mockito.mock(EmployeeService.class);
        EmployeeController controller=new EmployeeController(service);
        Mockito.when(service.getEmployee("1")).thenReturn(emp);



        Assert.assertEquals(controller.getEmplyee("1"),emp);
    }
    @Test
    public void testEmployee2(){
        System.out.println("running testEmployee 2");

        Employee emp = Mockito.mock(Employee.class);
        EmployeeService service = Mockito.mock(EmployeeService.class);
        EmployeeController controller=new EmployeeController(service);
        Mockito.when(service.getEmployee("2")).thenReturn(emp);



        Assert.assertNotEquals(controller.getEmplyee("3"),emp);
    }

    @Test
    public void testEmployee3(){
        System.out.println("running testEmployee 3");
        Mockery mockery = new Mockery();
        Employee emp = mockery.mock(Employee.class);
        EmployeeService service = mockery.mock(EmployeeService.class);

        mockery.checking(new Expectations(){
            {oneOf(service).getEmployee("3");}
        });



        EmployeeController controller=new EmployeeController(service);




        Assert.assertNotEquals(controller.getEmplyee("3"),emp);
    }
}
