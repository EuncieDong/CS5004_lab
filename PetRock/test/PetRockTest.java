import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetRockTest {
    @Test
    public void getName() throws Exception{
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.getName());
    }

}