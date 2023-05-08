package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;


/**
 @author Kasper Vork
 This is an interface which is completely abstract,
 other classes can implement this to use its methods.
    Both methods requires the two parameters gamedata and world,
    and they are void functions.

*/


public interface IGamePluginService {
    void start(GameData gameData, World world);

    void stop(GameData gameData, World world);
}
