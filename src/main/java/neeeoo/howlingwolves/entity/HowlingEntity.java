package neeeoo.howlingwolves.entity;

public interface HowlingEntity {
	boolean isHowling();

	void setHowling(boolean howling);

	float getHowlAnimationProgress(float delta);
}
