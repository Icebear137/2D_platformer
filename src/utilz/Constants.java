package utilz;

public class Constants {
	public static class Directions {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}

	public static class PlayerConstants {
		public static final int IDLE = 0;
		public static final int RUNNING1 = 1;
		public static final int RUNNING2 = 2;
		public static final int JUMP = 3;
		public static final int FALLING = 4;
		public static final int ATTACK_1 = 5;
		public static final int ATTACK_2 = 6;
		public static final int HIT = 7;
		public static final int DEATH = 8;

		public static int GetSpriteAmount(int player_action) {
			switch (player_action) {
			case RUNNING1:
			case RUNNING2:
				return 8;
			case IDLE:
				return 8;
			case HIT:
				return 4;
			case JUMP:
			case FALLING:
				return 2;
			case ATTACK_1:
			case ATTACK_2:
			case DEATH:
				return 6;
			default:
				return 1;
			}
		}
	}

}
