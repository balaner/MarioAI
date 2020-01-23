package de.novatec.marioai.tools;

import java.util.ArrayList;
import java.util.List;

import ch.idsia.ai.agents.Agent;
import ch.idsia.ai.tasks.ChallengeTask;
import ch.idsia.ai.tasks.Task;
/**
 * 
 * Builder pattern for MarioAiRunner
 * 
 */
public class MarioAiRunnerBuilder implements Builder<MarioAiRunner>{
	private List<Agent> agents = new ArrayList<Agent>();
	private LevelConfig levelConfig = LevelConfig.ASTAR_KILLER2;
	private Task task = new ChallengeTask(); 
	private int fps = 24; 
	private int zoomFactor = 3; 
	private boolean randomize = false; 
	private boolean viewable = true;
	private boolean debugView = false;
	private boolean exitOnFinish = false; 
	private boolean pushMetrics = false;
	
	/**
	 * returns a new marioairunner with the settings in this class
	 */
	public MarioAiRunner construct() {
		return new MarioAiRunner(this);
	}

	public List<Agent> getAgents() {
		return agents;
	}
	/**
	 * 
	 * @param agents to be added to the builder
	 * @return this, for easier usage
	 */
	public MarioAiRunnerBuilder addAllAgents(List<Agent> agents) {
		this.agents.addAll(agents);
		return this;
	}
	/**
	 * @param agent to be added to the builder
	 * @return this for easier usage
	 */
	public MarioAiRunnerBuilder addAgent(Agent agent) {
		this.agents.add(agent);
		return this;
	}
	
	public LevelConfig getLevelConfig() {
		return levelConfig;
	}
	/**
	 * @param levelConfig to be set if not null
	 * @return this for easier usage
	 */
	public MarioAiRunnerBuilder setLevelConfig(LevelConfig levelConfig) {
		if(levelConfig != null) {
			this.levelConfig = levelConfig;
		}
		return this;
	}

	public Task getTask() {
		return task;
	}
	
	/**
	 * @param task to be set if not null
	 * @return this for easier usage
	 */
	public MarioAiRunnerBuilder setTask(Task task) {
		if(task != null) {
			this.task = task;
		}
		return this;
	}

	public int getFps() {
		return fps;
	}
	/**
	 * @param fps to be set if > 0
	 * @return this for easier usage
	 */
	public MarioAiRunnerBuilder setFps(int fps) {
		if(fps>0) {
			this.fps = fps;
		}
		return this;
	}

	public int getZoomFactor() {
		return zoomFactor;
	}
	/**
	 * 
	 * @param zoomFactor to be set if > 0
	 * @return this for easier usage
	 */
	public MarioAiRunnerBuilder setZoomFactor(int zoomFactor) {
		if(zoomFactor>0) {
			this.zoomFactor = zoomFactor;
		}
		return this;
	}

	public boolean isRandomize() {
		return randomize;
	}

	public MarioAiRunnerBuilder setRandomize(boolean randomize) {
		this.randomize = randomize;
		return this;
	}

	public boolean isViewable() {
		return viewable;
	}

	public MarioAiRunnerBuilder setViewable(boolean viewable) {
		this.viewable = viewable;
		return this;
	}

	public boolean isDebugView() {
		return debugView;
	}

	public MarioAiRunnerBuilder setDebugView(boolean debugView) {
		this.debugView = debugView;
		return this;
	}

	public boolean isExitOnFinish() {
		return exitOnFinish;
	}

	public MarioAiRunnerBuilder setExitOnFinish(boolean exitOnFinish) {
		this.exitOnFinish = exitOnFinish;
		return this;
	}

	public boolean isPushMetrics() {
		return pushMetrics;
	}

	public MarioAiRunnerBuilder setPushMetrics(boolean pushMetrics) {
		this.pushMetrics = pushMetrics;
		return this;
	}
	
	public MarioAiRunnerBuilder removeAgent(Agent agent) {
		agents.remove(agent);
		return this;
	}
	
	public MarioAiRunnerBuilder removeAgents(List<Agent> agents) {
		this.agents.removeAll(agents);
		return this;
	}
}
