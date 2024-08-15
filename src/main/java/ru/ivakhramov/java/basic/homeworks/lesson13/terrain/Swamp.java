package ru.ivakhramov.java.basic.homeworks.lesson13.terrain;

import ru.ivakhramov.java.basic.homeworks.lesson13.transport.Transport;

// 4. В приложении должны быть типы местности: густой лес, равнина, болото
public class Swamp implements Terrain {

    private final String type;

    public Swamp() {
        this.type = "Болото";
    }

    public String getType() {
        return type;
    }

    // 8. У каждого вида транспорта есть местности по которым он не может перемещаться:
    // машина - густой лес и болото,
    // лошадь и велосипед - болото,
    // вездеход - нет ограничений
    @Override
    public boolean canMove(Transport transport) {
        return transport.getType().equals("Вездеход");
    }
}
