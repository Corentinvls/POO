/**
 * WizardArchetype Class extends by DefaultArchetype
 * @see #magicDamage int number to do magical damage
 */
public class WizardArchetype extends DefaultArchetype
{
    private int magicDamage;

    /**
     * WizardArchetype constructor
     * @param name string to set the character name
     */
    public WizardArchetype (String name)
    {
        super(name);
        this.magicDamage = 50;
        this.setArchetypeName("Wizard");
    }

    /**
     * Override method reset from DefaultArchetype to reset the archetype properties
     */
    @Override
    public void reset()
    {
        this.setLife(100);
        this.magicDamage = 50;
    }

    /**
     * Override method attack from DefaultArchetype
     * @return int of archetype's attack
     */
    @Override
    public int attack()
    {
        int damageSend = this.getDamage() + this.magicDamage;
        if(this.magicDamage == 0)
            Commands.printn(this.getName() + " 's stick is broken !");
        else
        {
            Commands.printn(this.getName() + "'s stick inflict : " + (this.magicDamage) + " magical damage.");
            this.magicDamage /= 2;
        }
        return  damageSend;
    }
}