package ch.idsia.mario.engine;

import java.util.List;
import java.util.Map;

import ch.idsia.mario.engine.level.Level;
import ch.idsia.mario.engine.sprites.Sprite;
import ch.idsia.mario.engine.sprites.Mario.MODE;
import ch.idsia.mario.engine.sprites.Mario.STATUS;
import de.novatec.mario.engine.generalization.Coordinates;
import de.novatec.mario.engine.generalization.Tile;
import de.novatec.marioai.tools.MarioInput;

public class LevelSceneWrapper {
	private LevelScene ls = null;
	private MarioInput input = null;
	private boolean[] keys = null;
	
	public LevelSceneWrapper(LevelScene copy) {
		ls = copy;
	}
	
	public byte[][] levelSceneObservation(int ZLevel) {
		return ls.levelSceneObservation(ZLevel);
	}
	
	public Map<Coordinates, Tile> getTiles(){
		return ls.getTiles();
	}
	
	public float[] enemiesFloatPos() {
		return ls.enemiesFloatPos();
	}
	
	public byte[][] mergedObservation(int ZLevelScene, int ZLevelEnemies){
		return ls.mergedObservation(ZLevelScene, ZLevelEnemies);
	}
	
	public String bitmapLevelObservation(int ZLevel) {
		return ls.bitmapLevelObservation(ZLevel);
	}
	
	public String bitmapEnemiesObservation(int ZLevel) {
		return ls.bitmapEnemiesObservation(ZLevel);
	}
	
	public List<String> LevelSceneAroundMarioASCII(boolean Enemies, boolean LevelMap, boolean mergedObservationFlag, int ZLevelScene, int ZLevelEnemies) {
		return LevelSceneAroundMarioASCII(Enemies, LevelMap, mergedObservationFlag, ZLevelScene, ZLevelEnemies);
	}
	
	public int getFireballsOnScreen() {
		return ls.getFireballsOnScreen();
	}
	
	public int getStartTime() {
		return getStartTime();
	}

	public int getTimeLeft() {
		return getTimeLeft();
	}
	
	public int getExactTimeLeft() {
		return ls.getExactTimeLeft();
	}
	
	public int getExactStartTime() {
		return ls.getExactStartTime();
	}
	
	public int getKilledCreaturesTotal() {
		return ls.getKilledCreaturesTotal();
	}
	
	public int getKilledCreaturesByFireBall() {
		return ls.getKilledCreaturesByFireBall();
	}

	public int getKilledCreaturesByStomp() {
		return ls.getKilledCreaturesByStomp();
	}

	public int getKilledCreaturesByShell() {
		return ls.getKilledCreaturesByShell();
	}
	
	public float getMarioX() {
		return ls.getMarioX();
	}
	
	public int getMarioMapX() {
		return ls.getMarioMapX();
	}
	
	public float getMarioXA() {
		return ls.getMarioXA();
	}
	
	public float getMarioXCam() {
		return ls.getMarioXCam();
	}
	
	public float getMarioY() {
		return ls.getMarioY();
	}
	
	public int getMarioMapY() {
		return ls.getMarioMapY();
	}
	
	public float getMarioYA() {
		return ls.getMarioYA();
	}
	
	public Coordinates getMarioPos() {
		return ls.getMarioPos();
	}
	
	public Coordinates getMarioFloatPos() {
		return ls.getMarioFloatPos();
	}
	
	public int getMarioFacing() {
		return ls.getMarioFacing();
	}
	
	public boolean isMarioSliding() {
		return ls.isMarioSliding();
	}
	
	public boolean isMarioCarrying() {
		return ls.isMarioCarrying();
	}
	
	public int getMarioCoins() {
		return ls.getMarioCoins();
	}
	
	public boolean mayMarioJump() {
		return ls.mayMarioJump();
	}
	
	public boolean mayMarioShoot() {
		return ls.mayMarioShoot();
	}
	
	public boolean isMarioFalling() {
		return ls.isMarioFalling();
	}
	
	public int getMarioHeight() {
		return ls.getMarioHeight();
	}
	
	public MODE getMarioMode() {
		return ls.getMarioMode();
	}
	
	public STATUS getMarioStatus(){
		return ls.getMarioStatus();
	}
	
	public boolean isMarioOnGround() {
		return ls.isMarioOnGround();
	}
	
	public boolean wasMarioOnGround() {
		return ls.wasMarioOnGround();
	}

	public int getTimesMarioHurt() {
		return ls.getTimesMarioHurt();
	}
	
	public int getMarioGainedFowers() {
		return ls.getMarioGainedFowers();
	}
	
	public int getMarioGainedMushrooms() {
		return ls.getMarioGainedMushrooms();
	}
	
	public Sprite getMarioCarried() {
		return ls.getMarioCarried();		//TODO: participant might manipulate what mario is carrying
	}
	
	public double getScore() {
		return ls.getScore();
	}

	List<Sprite> getSprites() {
		return ls.getSprites();		// TODO: look above
	}

	public LevelSceneWrapper getAStarCopy() {
		return this;
	}

	public LevelSceneWrapper getDeepCopy() {
		return this;
	}
	
	public Level.LEVEL_TYPES getLevelType() {
		return ls.getLevelType();
	}
	
	public int getTotalCoins() {
		return ls.getTotalCoins();
	}

	/*protected Level getLevel() {
		return ls.getLevel();
	}*/
	
	public int getLevelDifficulty() {
		return ls.getLevelDifficulty();
	}
		
	public long getLevelSeed() {
		return ls.getLevelSeed();
	}

	public boolean levelIsBlocking(int x, int y, float xa, float ya) {
		return ls.levelIsBlocking(x, y, xa, ya);
	}
	
	public byte levelGetBlock(int x, int y) {
		return ls.levelGetBlock(x, y);
	}
	
	public int getLevelWidth() {
		return ls.getLevelWidth();
	}
	
	public int getLevelHight() {
		return ls.getLevelHight();
	}
	
	public double getLevelWidthPhys() {
		return ls.getLevelWidthPhys();
	} 
	
	public int getLevelXExit() {
		return ls.getLevelXExit();
	}

	public float getxCam() {
		return ls.getxCam();
	}

	public float getyCam() {
		return ls.getyCam();
	}
	
	public int getTick() {
		return ls.getTick();
	}
	
	public int getTotalTime() {
		return ls.getTotalTime(); 
	}
	
	public void setMarioKeys(boolean[] input) {
		keys = input;
	}
	
	public void setMarioInput(MarioInput input) {
		this.input = input;
	}
	
	public LevelSceneWrapper tick() {
		LevelScene tmp = new LevelScene(ls, true);
		if(input != null) {
			tmp.setMarioInput(input);
		}
		else if (keys != null) {
			tmp.setMarioKeys(keys);
		}
		tmp.tick();
		return new LevelSceneWrapper(tmp);
	}
}