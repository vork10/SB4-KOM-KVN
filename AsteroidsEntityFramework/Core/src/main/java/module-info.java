import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;



module Core {
    requires Common;
    requires com.badlogic.gdx;
    requires java.desktop;
    requires CommonBullet;
    requires CommonEnemy;
    requires CommonAsteroid;
    requires spring.context;

    uses IGamePluginService;
    uses IPostEntityProcessingService;
    uses IEntityProcessingService;

}