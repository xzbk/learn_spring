package spring.aop.staticproxy;
/**
 * 代理类(王婆)
 * @author Administrator
 *
 */
public class WangPo implements Dating{
	private JinLian jl;

	public JinLian getJl() {
		return jl;
	}

	public void setJl(JinLian jl) {
		this.jl = jl;
	}

	@Override
	public void dating() {
		// TODO Auto-generated method stub
		System.out.println("bofore dating , do some works");
		jl.dating();
	}
	
}
