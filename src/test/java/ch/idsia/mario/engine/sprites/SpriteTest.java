package ch.idsia.mario.engine.sprites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpriteTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

	void BrickAnim_MoveX() {
		int x =5;
		int y = 6;
		float xa = 1;
		float ya = 1;
		BrickAnim anim = new BrickAnim(null, x, y, xa, ya);
		anim.move();
		x+=xa;
        ya*=0.95f;
        assertEquals(x, anim.x);
	}
	void BrickAnim_MoveY() {
		int x =5;
		int y = 6;
		float xa = 1;
		float ya = 1;
		BrickAnim anim = new BrickAnim(null, x, y, xa, ya);
		anim.move();
		x+=xa;
        ya*=0.95f;
        assertEquals(y, anim.y);
	}
	void BrickAnim_MoveYa() {
		int x =5;
		int y = 6;
		float xa = 1;
		float ya = 1;
		BrickAnim anim = new BrickAnim(null, x, y, xa, ya);
		anim.move();
		x+=xa;
        ya*=0.95f;
        assertEquals(ya, anim.ya);
	}
	void CoinAnim_MoveX() {
		int x = 3;
		int y = 7;
		float xa = 0;
		float ya = -6f;
		CoinAnim anim = new CoinAnim(null, x, y);
		x += xa;
        y += ya;
        ya += 1;
        anim.move();
        assertEquals(x, anim.x);
	}
	void CoinAnim_MoveY() {
		
		int x = 3;
		int y = 7;
		float xa = 0;
		float ya = -6f;
		CoinAnim anim = new CoinAnim(null, x, y);
		x += xa;
	    y += ya;
	    ya += 1;
	    anim.move();
	    assertEquals(y, anim.y);
	}
	void CoinAnim_MoveYa() {
		int x = 3;
		int y = 7;
		float xa = 0;
		float ya = -6f;
		CoinAnim anim = new CoinAnim(null, x, y);
		x += xa;
	    y += ya;
	    ya += 1;
	    anim.move();
	    assertEquals(ya, anim.ya);
	}
	void FireFlower_MoveY() {
		int y = 9;
		int x = 5;
		FireFlower flower = new FireFlower(null, x, y);
		y--;
		flower.move();
		assertEquals(y, flower.y);
	}
	void FireFlower_MoveYAlive() {
		int y = 20;
		int x = 5;
		FireFlower flower = new FireFlower(null, x, y);
		for(int i=0;i<10;i++)flower.move(); // life > 9
		y -= 10;
		flower.move();
		assertEquals(y, flower.y);
	}
	void Mushroom_Move_Spawn() {
		int x = 20;
		int y = 40;
		Mushroom mush = new Mushroom(null, x, y);
		y--;
		mush.move();
		assertEquals(y, mush.y);
	}
	void Mushroom_Move_Alive_Ground() {
		
	}
	void Sparkle_MoveX() {
		int x = 5;
		int y = 7;
		float xa = 4f;
		float ya = 3f;
		Sparkle spark = new Sparkle(null, x, y, xa, ya);
		x+=xa;
        y+=ya;
        assertEquals(x, spark.x);
	}
	void Sparkle_MoveY() {
		int x = 5;
		int y = 7;
		float xa = 4f;
		float ya = 3f;
		Sparkle spark = new Sparkle(null, x, y, xa, ya);
		x+=xa;
        y+=ya;
        assertEquals(y, spark.y);
	}
	void Spiky_Move() {
		
	}
	
	/*TODO: 
	void BulletBill_Move() {
		
	}
	void Fireball_Move() {
		
	}
	void FlowerEnemy_Move() {
		
	}
	void Goomba_Move() {
		
	}
	void Koopa_Green_Move() {
		
	}
	void Koopa_Red_Move() {
		
	}
	void Shell_Move() {
		
	}
	*/
}
