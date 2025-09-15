package crypto;

public class Crypto {
	public static String encrypt(String m, int n)
	{
		String inging = "";
		int y = 0;
		String thing = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < m.length(); i++)
		{
			y = thing.indexOf(m.substring(i, i + 1).toLowerCase());
			if (y != -1)
			{
				if (y <= (26 - n))
				{
					if (m.substring(i, i + 1).equals(m.substring(i, i + 1).toUpperCase())) {
						inging += thing.substring(y + n, y + (n + 1)).toUpperCase();
					}
					else
					{
						inging += thing.substring(y + n, y + (n + 1));
					}
				}
				else {
					if (m.substring(i, i + 1).equals(m.substring(i, i + 1).toUpperCase())) {
						inging += thing.substring((n - (26 - y)), n - (26 - y) + 1).toUpperCase();
					}
					else
					{
						inging += thing.substring((n - (26 - y)), n - (26 - y) + 1);
					}
				}
			}
			else
			{
				inging += m.substring(i, i + 1);
			}
		}
		return inging;
	}
	public static String decrypt(String m, int n)
	{
		String inging = "";
		int y = 0;
		String thing = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < m.length(); i++)
		{
			y = thing.indexOf(m.substring(i, i + 1).toLowerCase());
			if (y != -1)
			{
				if (y >= (n))
				{
					if (m.substring(i, i + 1).equals(m.substring(i, i + 1).toUpperCase())) {
						inging += thing.substring(y - n, (y - n) + 1).toUpperCase();
					}
					else
					{
						inging += thing.substring(y - n, (y - n) + 1);
					}
				}
				else {
					if (m.substring(i, i + 1).equals(m.substring(i, i + 1).toUpperCase())) {
						inging += thing.substring(26 - (n - y), (26 - (n - y) + 1)).toUpperCase();
					}
					else
					{
						inging += thing.substring(26 - (n - y), (26 - (n - y) + 1));
					}
				}
			}
			else
			{
				inging += m.substring(i, i + 1);
			}
		}
		return inging;
	}
}
