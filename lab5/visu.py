import pandas as pd
import matplotlib.pyplot as plt

# Lê o arquivo txt gerado pelo Java
df = pd.read_csv("lab5/resultados_quicksort.txt", sep=';', encoding='latin1')

# Corrige possíveis problemas de acentuação (opcional)
df['Variação do Pivô'] = df['Variação do Pivô'].str.replace('�', 'ê')

# Pivot para reorganizar os dados: colunas = estratégias, linhas = tamanhos
pivot_df = df.pivot(index='Tamanho', columns='Variação do Pivô', values='Tempo(ms)')

# Plota gráfico de linhas
plt.figure(figsize=(10,6))
for col in pivot_df.columns:
    plt.plot(pivot_df.index, pivot_df[col], marker='o', label=col)

plt.title("Desempenho do QuickSort por Estratégia de Pivô")
plt.xlabel("Tamanho do Array")
plt.ylabel("Tempo de Execução (ms)")
plt.xticks(pivot_df.index)  # garante que só apareçam 100, 1000, 10000
plt.grid(True)
plt.legend()
plt.tight_layout()
plt.show()
