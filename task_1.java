@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    // Напиши код здесь
    assertEquals("Человеку меньше 18 лет", true, isAdult);
}