
public class CovidSimulation
{
    private HeroIterface vaccinated;
    private HeroIterface unvacMaskedIndoor;
    private HeroIterface unvacUnmaskedIndoor;
    private HeroIterface unvacUnmaskedOutdoor;
    private HeroIterface unvacMaskedOutdoor;
    private HeroIterface infected;
    private HeroIterface state = unvacUnmaskedIndoor;
   
    
    public HeroIterface getVaccinatedState()
    {
        return vaccinated;
    }
    
    public HeroIterface getUnvacMaskedIndoor()
    {
        return unvacMaskedIndoor;
    }
    
    public HeroIterface getUnvacUnaskedIndoor()
    {
        return unvacUnmaskedIndoor;
    }
    
    public HeroIterface getUnvacUnmaskedOutdoor()
    {
        return unvacUnmaskedOutdoor;
    }
    
    public HeroIterface getUnvacMaskedOutdoor()
    {
        return unvacMaskedOutdoor;
    }
    
    public HeroIterface getInfected()
    {
        return infected;
    }
    
    public void setCurrentState(HeroIterface HeroState)
    {
        state = HeroState;
    }
    
    public void signalVaccinated()
    {
        state.vaccinated();
    }
    
    public void signalTakeMaskOff()
    {
        state.takeOffMask();
    }
    
    public void signalPutMaskOn()
    {
        state.putOnMask();
    }
    
    public void signalGoOutside()
    {
        state.goOutside();
    }
    
    public void signalGoInside()
    {
        state.goInside();
    }
    
    public void signalContact(boolean masked)
    {
        state.contact(masked);
    }
}
