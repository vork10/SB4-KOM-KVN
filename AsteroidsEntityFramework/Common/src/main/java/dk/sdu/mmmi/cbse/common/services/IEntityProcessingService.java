package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 @author Kasper Vork
 This is an interface which is completely abstract,
 other classes can implement this to use its methods.
 The method requires the two parameters gamedata and world,
 and it is a void function.

 */


public interface IEntityProcessingService {

    void process(GameData gameData, World world);
}
