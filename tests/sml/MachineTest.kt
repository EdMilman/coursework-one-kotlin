package sml

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class MachineTest{
    val m = Machine(0, 32)

    @Test
    fun testLin(){
        m.readAndTranslate("test1.sml")
        m.execute()
        assertEquals(66, m.registers.getRegister(1))
    }

    @Test
    fun testAdd(){
        m.readAndTranslate("testAdd.sml")
        m.execute()
        assertEquals(2, m.registers.getRegister(1))
    }

    @Test
    fun testSub(){
        m.readAndTranslate("testSub.sml")
        m.execute()
        assertEquals(0, m.registers.getRegister(1))
    }

    @Test
    fun testMultiply(){
        m.readAndTranslate("testMulti.sml")
        m.execute()
        assertEquals(10, m.registers.getRegister(1))
    }

    @Test
    fun testDiv(){
        m.readAndTranslate("testDiv.sml")
        m.execute()
        assertEquals(2, m.registers.getRegister(1))
    }

    @Test
    fun testBnz(){
        m.readAndTranslate("test3.sml")
        m.execute()
        assertEquals(720, m.registers.getRegister(21))
    }
}