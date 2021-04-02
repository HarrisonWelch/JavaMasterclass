package com.company;

public class Main {

    public static void main(String[] args) {
	    // RoomChallenge

        Room room = new Room(
                new Lamp(
                        false,
                        true,
                        10
                ),
                new Sofa(
                        3,
                        30,
                        5,
                        10
                ),
                new Chair(
                        false,
                        10,
                        5,
                        10
                ),
                new TV(
                        55,
                        10,
                        "LCD"
                ),
                new Stereo(
                        130,
                        5,
                        5,
                        5,
                        5
                )
        );
    }
}
