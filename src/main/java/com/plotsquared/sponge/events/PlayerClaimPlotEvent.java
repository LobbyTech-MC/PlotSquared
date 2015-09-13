package com.plotsquared.sponge.events;

import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.event.Cancellable;

import com.intellectualcrafters.plot.object.Plot;

public class PlayerClaimPlotEvent extends PlayerEvent implements Cancellable {
    
    private final Plot plot;
    private final boolean auto;
    private boolean cancelled;
    
    /**
     * PlayerClaimPlotEvent: Called when a plot is claimed
     *
     * @param player Player that claimed the plot
     * @param plot   Plot that was claimed
     */
    public PlayerClaimPlotEvent(final Player player, final Plot plot, final boolean auto) {
        super(player);
        this.plot = plot;
        this.auto = auto;
    }
    
    /**
     * Get the plot involved
     *
     * @return Plot
     */
    public Plot getPlot() {
        return plot;
    }
    
    /**
     * @return true if it was an automated claim, else false
     */
    public boolean wasAuto() {
        return auto;
    }
    
    @Override
    public boolean isCancelled() {
        return cancelled;
    }
    
    @Override
    public void setCancelled(final boolean cancel) {
        cancelled = cancel;
    }
}
